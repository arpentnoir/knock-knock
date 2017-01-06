package io.swagger.api;


import io.swagger.Utils;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-06T00:15:59.591Z")

@Controller
public class ApiApiController implements ApiApi {

    public ResponseEntity<Long> fibonacciGet(@ApiParam(value = "The index (n) of the fibonacci sequence", required = true) @RequestParam(value = "n", required = true) Long n) {
      long result;
      try {
        result = Utils.fibonacci(n);
      } catch(NumberFormatException e){
        return new ResponseEntity<Long>(HttpStatus.BAD_REQUEST);
      }
        return new ResponseEntity<Long>(result,HttpStatus.OK);
    }

    public ResponseEntity<String> reverseWordsGet(@ApiParam(value = "A sentence") @RequestParam(value = "sentence", required = false) String sentence) {
        String result = Utils.reverseWords(sentence);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

    public ResponseEntity<String> tokenGet() {
      String token = "\"03c5e92c-292d-45f6-a74b-dc7981f6d821\"";
      return new ResponseEntity<String>(token, HttpStatus.OK);
    }

    public ResponseEntity<String> triangleTypeGet(@ApiParam(value = "The length of side a", required = true) @RequestParam(value = "a", required = true) Integer a,
                                                  @ApiParam(value = "The length of side b", required = true) @RequestParam(value = "b", required = true) Integer b,
                                                  @ApiParam(value = "The length of side c", required = true) @RequestParam(value = "c", required = true) Integer c) {
        String result = Utils.triangleType(a, b, c);
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

}
