package de.ajish.spacex.challenge.client.model.crew;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "docs",
        "totalDocs",
        "offset",
        "limit",
        "totalPages",
        "page",
        "pagingCounter",
        "hasPrevPage",
        "hasNextPage",
        "prevPage",
        "nextPage"
})
public class CrewQueryResponse {

    @JsonProperty("docs")
    private List<CrewMember> docs = new ArrayList<CrewMember>();
    @JsonProperty("totalDocs")
    private Integer totalDocs;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pagingCounter")
    private Integer pagingCounter;
    @JsonProperty("hasPrevPage")
    private Boolean hasPrevPage;
    @JsonProperty("hasNextPage")
    private Boolean hasNextPage;
    @JsonProperty("prevPage")
    private Object prevPage;
    @JsonProperty("nextPage")
    private Integer nextPage;

    @JsonProperty("docs")
    public List<CrewMember> getDocs() {
        return docs;
    }

    @JsonProperty("docs")
    public void setDocs(List<CrewMember> docs) {
        this.docs = docs;
    }

    @JsonProperty("totalDocs")
    public Integer getTotalDocs() {
        return totalDocs;
    }

    @JsonProperty("totalDocs")
    public void setTotalDocs(Integer totalDocs) {
        this.totalDocs = totalDocs;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("pagingCounter")
    public Integer getPagingCounter() {
        return pagingCounter;
    }

    @JsonProperty("pagingCounter")
    public void setPagingCounter(Integer pagingCounter) {
        this.pagingCounter = pagingCounter;
    }

    @JsonProperty("hasPrevPage")
    public Boolean getHasPrevPage() {
        return hasPrevPage;
    }

    @JsonProperty("hasPrevPage")
    public void setHasPrevPage(Boolean hasPrevPage) {
        this.hasPrevPage = hasPrevPage;
    }

    @JsonProperty("hasNextPage")
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    @JsonProperty("hasNextPage")
    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    @JsonProperty("prevPage")
    public Object getPrevPage() {
        return prevPage;
    }

    @JsonProperty("prevPage")
    public void setPrevPage(Object prevPage) {
        this.prevPage = prevPage;
    }

    @JsonProperty("nextPage")
    public Integer getNextPage() {
        return nextPage;
    }

    @JsonProperty("nextPage")
    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

}