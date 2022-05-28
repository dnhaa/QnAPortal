/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadn.oauth2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class PostRequest {


public void getHttpCon() throws Exception{

    String POST_PARAMS = "grant_type=authorization_code&client_id=872517996573-61u2am7rk2fi8oeki0m1ga09194njris.apps.googleusercontent.com&client_secret=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&code=4/0AX4XfWitx4HWfgTic3GvQwiJ_HBV_fv99mNzm8Hyoj5nRoALLwkLfUuhE96VvX-Fh9uLmA&redirect_uri=http://localhost:8084/QnAPortal";
    URL obj = new URL("https://oauth2.googleapis.com/token");
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json;odata=verbose");
    con.setRequestProperty("Authorization",
            "Basic Base64_encoded_clientId:clientSecret");
    con.setRequestProperty("Accept",
            "application/x-www-form-urlencoded");

    // For POST only - START
    con.setDoOutput(true);
    OutputStream os = con.getOutputStream();
    os.write(POST_PARAMS.getBytes());
    os.flush();
    os.close();
    // For POST only - END

    int responseCode = con.getResponseCode();
    System.out.println("POST Response Code :: " + responseCode);

    if (responseCode == HttpURLConnection.HTTP_OK) { //success
        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // print result
        System.out.println(response.toString());
    } else {
        System.out.println("POST request not worked");
    }
}    
}
