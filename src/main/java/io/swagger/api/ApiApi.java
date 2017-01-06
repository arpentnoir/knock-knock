package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-06T00:15:59.591Z")

@Api(value = "api", description = "the api API")
public interface ApiApi {

    @ApiOperation(value = "Returns the nth fibonacci number.", notes = "Returns the nth number in the fibonacci sequence.", response = Long.class, tags={ "Fibonacci", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class) })
    @RequestMapping(value = "/api/Fibonacci",
        produces = { "application/json", "text/json" },
        method = RequestMethod.GET)
    ResponseEntity<Long> fibonacciGet(@ApiParam(value = "The index (n) of the fibonacci sequence", required = true) @RequestParam(value = "n", required = true) Long n);


    @ApiOperation(value = "Reverses the letters of each word in a sentence.", notes = "Reverses the letters of each word in a sentence.", response = Long.class, tags={ "ReverseWords", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Long.class) })
    @RequestMapping(value = "/api/ReverseWords",
        produces = { "application/json", "text/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Long> reverseWordsGet(@ApiParam(value = "A sentence") @RequestParam(value = "sentence", required = false) String sentence);


    @ApiOperation(value = "Your token.", notes = "Your token.", response = String.class, tags={ "Token", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    @RequestMapping(value = "/api/Token",
        produces = { "application/json", "text/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> tokenGet();


    @ApiOperation(value = "Returns the type of triange given the lengths of its sides.", notes = "Returns the type of triange given the lengths of its sides", response = Integer.class, tags={ "TriangleType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Integer.class) })
    @RequestMapping(value = "/api/TriangleType",
        produces = { "application/json", "text/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Integer> triangleTypeGet(@ApiParam(value = "The length of side a", required = true) @RequestParam(value = "a", required = true) Integer a,
        @ApiParam(value = "The length of side b", required = true) @RequestParam(value = "b", required = true) Integer b,
        @ApiParam(value = "The length of side c", required = true) @RequestParam(value = "c", required = true) Integer c);

}
