package org.acme;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Input, String> {

    @Override
    public String handleRequest(Input input, Context context) {
        return "Hello, " + input.getName() + "!";
    }
}