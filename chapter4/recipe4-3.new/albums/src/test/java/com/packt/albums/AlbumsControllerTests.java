package com.packt.albums;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class AlbumsControllerTests {

  @Autowired
  MockMvc mvc;

  // private static WireMockServer footballMockServer;
  // private static WireMockServer eurekaMockServer;

  // @BeforeAll
  // static void init() {
  //     footballMockServer = new WireMockServer(45459);
  //     footballMockServer.start();
  //     WireMock.configureFor(45459);

  //     eurekaMockServer = new WireMockServer(8762);
  //     eurekaMockServer.start();
  //     WireMock.configureFor(8762);
  // }

  @Test
  public void testGetPlayers() throws Exception {
    // WireMock.stubFor(WireMock.get("/eureka/v2/apps/FootballServer")
    //         .willReturn(WireMock.aResponse()
    //                 .withStatus(200)
    //                 .withHeader("Content-Type", "application/json")
    //                 .withBodyFile("eureka-FootballServer.json")));

    // WireMock.stubFor(WireMock.get("/eureka/v2/apps")
    //         .willReturn(WireMock.aResponse()
    //                 .withStatus(200)
    //                 .withHeader("Content-Type", "application/json")
    //                 .withBodyFile("eureka-FootballServer.json")));

    // WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/players"))
    //         .willReturn(WireMock.aResponse()
    //                 .withHeader("Content-Type", "application/json")
    //                 .withBody("""
    //                         [
    //                             {
    //                                 "id": "325636",
    //                                 "jerseyNumber": 11,
    //                                 "name": "Alexia PUTELLAS",
    //                                 "position": "Midfielder",
    //                                 "dateOfBirth": "1994-02-04"
    //                             },
    //                             {
    //                                 "id": "396930",
    //                                 "jerseyNumber": 2,
    //                                 "name": "Ona BATLLE",
    //                                 "position": "Defender",
    //                                 "dateOfBirth": "1999-06-10"
    //                             }
    //                         ]""")));

    mvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/albums/players"))
        .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk())
        .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("$[0].name")
            .value("Alexia PUTELLAS"));
  }

}
