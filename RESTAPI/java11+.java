// + JSON In Java jar

package com.example;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;



public class Main {
	

	
	public static void main(String[] args) {
		//Method 2: java.net.HttpURLConnection
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.imgflip.com/get_memes")).build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			.thenApply(HttpResponse::body)
			.thenApply(Main::parse)
			.join();
	}
	public static String parse(String s) {
		//JSONArray memes = new JSONArray(s);
		JSONObject body = new JSONObject(s);
		JSONObject data = body.getJSONObject("data");
		JSONArray memes = data.getJSONArray("memes");
		for(int i = 0; i < memes.length(); i++) {
			JSONObject meme = memes.getJSONObject(i);
			int id = meme.getInt("id");
			String url = meme.getString("url");
			String name = meme.getString("name");
			System.out.println(id + " " + url + " " + name);
		}
		return null;
			
		}
	}
