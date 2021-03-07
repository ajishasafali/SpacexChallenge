package de.ajish.spacex.challenge.client.mapper.crew;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.ajish.spacex.challenge.client.model.crew.CrewMember;
import de.ajish.spacex.challenge.client.model.crew.CrewQueryResponse;
import de.ajish.spacex.challenge.server.model.crew.CrewDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CrewMapperTest {
    @Test
    void testMapCrewToCrewDetails() throws JsonProcessingException {
        CrewQueryResponse crewQueryResponse = new CrewQueryResponse();
        crewQueryResponse.setDocs(null);

        CrewDetails crewDetails = CrewMapper.mapCrewToCrewDetails(crewQueryResponse);

        Assertions.assertNull(crewDetails);

        CrewMember crewMember1 = new CrewMember();
        crewMember1.setId("id1");
        CrewMember crewMember2 = new CrewMember();
        crewMember2.setId("id2");
        crewQueryResponse.setDocs(Arrays.asList(crewMember1, crewMember2));
        crewQueryResponse.setHasNextPage(null);
        crewQueryResponse.setLimit(null);

        crewDetails = CrewMapper.mapCrewToCrewDetails(crewQueryResponse);

        Assertions.assertNotNull(crewDetails);
        Assertions.assertEquals(2, crewDetails.getCrewMembers().size());
        Assertions.assertEquals(0, crewDetails.getActiveCrewFromList());

    }

    @Test
    void testMapCrewToCrewDetailsPositive() throws JsonProcessingException {
        CrewQueryResponse crewQueryResponse = createCrewQueryResponse();

        CrewDetails crewDetails = CrewMapper.mapCrewToCrewDetails(crewQueryResponse);
        Assertions.assertNotNull(crewDetails);
        Assertions.assertEquals("Robert Behnken", crewDetails.getCrewMembers().get(0).getName());
        Assertions.assertEquals(10 , crewDetails.getCrewMembers().size());
        Assertions.assertEquals(9 , crewDetails.getActiveCrewFromList());
        Assertions.assertEquals(3, crewDetails.getAgencyStrengths().size());
        Assertions.assertEquals("NASA", crewDetails.getCrewMembers().get(1).getAgency());
    }

    private CrewQueryResponse createCrewQueryResponse() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"docs\":[{\"name\":\"Robert Behnken\",\"agency\":\"NASA\",\"image\":\"https://imgur.com/0smMgMH.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Robert_L._Behnken\",\"launches\":[],\"status\":\"inactive\",\"id\":\"5ebf1a6e23a9a60006e03a7a\"},{\"name\":\"Douglas Hurley\",\"agency\":\"NASA\",\"image\":\"https://i.imgur.com/ooaayWf.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Douglas_G._Hurley\",\"launches\":[],\"status\":\"active\",\"id\":\"5ebf1b7323a9a60006e03a7b\"},{\"name\":\"Shannon Walker\",\"agency\":\"NASA\",\"image\":\"https://imgur.com/9z4tRIO.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Shannon_Walker\",\"launches\":[],\"status\":\"active\",\"id\":\"5f7f1543bf32c864a529b23e\"},{\"name\":\"Soichi Noguchi\",\"agency\":\"JAXA\",\"image\":\"https://imgur.com/7B1jxl8.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Soichi_Noguchi\",\"launches\":[],\"status\":\"active\",\"id\":\"5f7f158bbf32c864a529b23f\"},{\"name\":\"Victor J. Glover\",\"agency\":\"NASA\",\"image\":\"https://imgur.com/Vv5Hgzh.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Victor_J._Glover\",\"launches\":[],\"status\":\"active\",\"id\":\"5f7f15d5bf32c864a529b240\"},{\"name\":\"Michael S. Hopkins\",\"agency\":\"NASA\",\"image\":\"https://imgur.com/Dfg8OJ2.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Michael_S._Hopkins\",\"launches\":[],\"status\":\"active\",\"id\":\"5f7f1614bf32c864a529b241\"},{\"name\":\"Shane Kimbrough\",\"agency\":\"NASA\",\"image\":\"https://imgur.com/nwxqtcT.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Shane_Kimbrough\",\"launches\":[],\"status\":\"active\",\"id\":\"5fe3ba5fb3467846b3242188\"},{\"name\":\"K. Megan McArthur\",\"agency\":\"NASA\",\"image\":\"https://imgur.com/0VNXcdM.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/K._Megan_McArthur\",\"launches\":[],\"status\":\"active\",\"id\":\"5fe3bb01b3467846b3242189\"},{\"name\":\"Thomas Pesquet\",\"agency\":\"ESA\",\"image\":\"https://imgur.com/5iColcZ.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Thomas_Pesquet\",\"launches\":[],\"status\":\"active\",\"id\":\"5fe3bc3db3467846b324218b\"},{\"name\":\"Akihiko Hoshide\",\"agency\":\"JAXA\",\"image\":\"https://imgur.com/GefuPYs.png\",\"wikipedia\":\"https://en.wikipedia.org/wiki/Akihiko_Hoshide\",\"launches\":[],\"status\":\"active\",\"id\":\"5fe3bc8ab3467846b324218c\"}],\"totalDocs\":13,\"offset\":0,\"limit\":10,\"totalPages\":2,\"page\":1,\"pagingCounter\":1,\"hasPrevPage\":false,\"hasNextPage\":true,\"prevPage\":null,\"nextPage\":2}";
        CrewQueryResponse crewQueryResponse = objectMapper.readValue(json, CrewQueryResponse.class);
        return  crewQueryResponse;
    }

}
