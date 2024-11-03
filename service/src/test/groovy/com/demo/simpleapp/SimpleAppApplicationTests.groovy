package com.demo.simpleapp;


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import spock.lang.Specification;


@SpringBootTest
@AutoConfigureMockMvc
class SimpleAppApplicationTests extends  Specification{

	@Autowired
	private MockMvc mvc

	def "ache if applications is UP"() {
		expect: "Expect end point /actuator/health has \"status\": \"UP\" "
		mvc.perform(get("/actuator/health"))
				.andExpect(status().isOk())
	}

}
