package com.barath.app;

import java.util.Objects;

import feign.Response;
import feign.codec.ErrorDecoder;

public class ProductServiceErrorDecoder  implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		
		System.out.println("error response status"+response.status());
		System.out.println("error response "+response);
		return new Exception(Objects.toString(response));
	}

}
