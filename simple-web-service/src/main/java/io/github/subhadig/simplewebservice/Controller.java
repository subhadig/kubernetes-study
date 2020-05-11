package io.github.subhadig.simplewebservice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/details")
    public ResponseEntity<Map<String,String>> getMachineName() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            Map<String,String> response = new HashMap<>(2);
            response.put("Host name", addr.getHostName());
            response.put("IP address", addr.getHostAddress());
            return ResponseEntity.ok(response);
        } catch (UnknownHostException e) {
            return ResponseEntity.status(500).build();
        }
    }
}
