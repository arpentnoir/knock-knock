package io.swagger.api;


import io.swagger.Utils;
import io.swagger.annotations.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-06T00:15:59.591Z")

@Controller
public class ApiApiController implements ApiApi {

    public ResponseEntity<Long> fibonacciGet(@ApiParam(value = "The index (n) of the fibonacci sequence", required = true) @RequestParam(value = "n", required = true) Long n) {
        HttpHeaders responseHeaders = new HttpHeaders();
        long result = Utils.fibonacci(n);
        return new ResponseEntity<Long>(result, responseHeaders,HttpStatus.OK);
    }

    public ResponseEntity<String> reverseWordsGet(@ApiParam(value = "A sentence") @RequestParam(value = "sentence", required = false) String sentence) {
        HttpHeaders responseHeaders = new HttpHeaders();
        String result = Utils.reverseWords(sentence);
        return new ResponseEntity<String>(result, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<String> tokenGet() {
      HttpHeaders responseHeaders = new HttpHeaders();

      //responseHeaders.set("pragma", "no-cache");
      //responseHeaders.set("content-encoding", "gzip");

      String token = "03c5e92c-292d-45f6-a74b-dc7981f6d821";
      return new ResponseEntity<String>(token, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<Integer> triangleTypeGet(@ApiParam(value = "The length of side a", required = true) @RequestParam(value = "a", required = true) Integer a,
        @ApiParam(value = "The length of side b", required = true) @RequestParam(value = "b", required = true) Integer b,
        @ApiParam(value = "The length of side c", required = true) @RequestParam(value = "c", required = true) Integer c) {
        // do some magic!
        return new ResponseEntity<Integer>(HttpStatus.OK);
    }

}
