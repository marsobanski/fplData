import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "event",
    "finished",
    "finished_provisional",
    "id",
    "kickoff_time",
    "minutes",
    "provisional_start_time",
    "started",
    "team_a",
    "team_a_score",
    "team_h",
    "team_h_score",
    "stats",
    "team_h_difficulty",
    "team_a_difficulty",
    "pulse_id"
})
@Generated("jsonschema2pojo")
public class Fixture {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("event")
    private Integer event;
    @JsonProperty("finished")
    private Boolean finished;
    @JsonProperty("finished_provisional")
    private Boolean finishedProvisional;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("kickoff_time")
    private String kickoffTime;
    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("provisional_start_time")
    private Boolean provisionalStartTime;
    @JsonProperty("started")
    private Boolean started;
    @JsonProperty("team_a")
    private Integer teamA;
    @JsonProperty("team_a_score")
    private Object teamAScore;
    @JsonProperty("team_h")
    private Integer teamH;
    @JsonProperty("team_h_score")
    private Object teamHScore;
    @JsonProperty("stats")
    private List<Stat> stats = new ArrayList<Stat>();
    @JsonProperty("team_h_difficulty")
    private Integer teamHDifficulty;
    @JsonProperty("team_a_difficulty")
    private Integer teamADifficulty;
    @JsonProperty("pulse_id")
    private Integer pulseId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public Fixture withCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("event")
    public Integer getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(Integer event) {
        this.event = event;
    }

    public Fixture withEvent(Integer event) {
        this.event = event;
        return this;
    }

    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Fixture withFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }

    @JsonProperty("finished_provisional")
    public Boolean getFinishedProvisional() {
        return finishedProvisional;
    }

    @JsonProperty("finished_provisional")
    public void setFinishedProvisional(Boolean finishedProvisional) {
        this.finishedProvisional = finishedProvisional;
    }

    public Fixture withFinishedProvisional(Boolean finishedProvisional) {
        this.finishedProvisional = finishedProvisional;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Fixture withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("kickoff_time")
    public String getKickoffTime() {
        return kickoffTime;
    }

    @JsonProperty("kickoff_time")
    public void setKickoffTime(String kickoffTime) {
        this.kickoffTime = kickoffTime;
    }

    public Fixture withKickoffTime(String kickoffTime) {
        this.kickoffTime = kickoffTime;
        return this;
    }

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Fixture withMinutes(Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    @JsonProperty("provisional_start_time")
    public Boolean getProvisionalStartTime() {
        return provisionalStartTime;
    }

    @JsonProperty("provisional_start_time")
    public void setProvisionalStartTime(Boolean provisionalStartTime) {
        this.provisionalStartTime = provisionalStartTime;
    }

    public Fixture withProvisionalStartTime(Boolean provisionalStartTime) {
        this.provisionalStartTime = provisionalStartTime;
        return this;
    }

    @JsonProperty("started")
    public Boolean getStarted() {
        return started;
    }

    @JsonProperty("started")
    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Fixture withStarted(Boolean started) {
        this.started = started;
        return this;
    }

    @JsonProperty("team_a")
    public Integer getTeamA() {
        return teamA;
    }

    @JsonProperty("team_a")
    public void setTeamA(Integer teamA) {
        this.teamA = teamA;
    }

    public Fixture withTeamA(Integer teamA) {
        this.teamA = teamA;
        return this;
    }

    @JsonProperty("team_a_score")
    public Object getTeamAScore() {
        return teamAScore;
    }

    @JsonProperty("team_a_score")
    public void setTeamAScore(Object teamAScore) {
        this.teamAScore = teamAScore;
    }

    public Fixture withTeamAScore(Object teamAScore) {
        this.teamAScore = teamAScore;
        return this;
    }

    @JsonProperty("team_h")
    public Integer getTeamH() {
        return teamH;
    }

    @JsonProperty("team_h")
    public void setTeamH(Integer teamH) {
        this.teamH = teamH;
    }

    public Fixture withTeamH(Integer teamH) {
        this.teamH = teamH;
        return this;
    }

    @JsonProperty("team_h_score")
    public Object getTeamHScore() {
        return teamHScore;
    }

    @JsonProperty("team_h_score")
    public void setTeamHScore(Object teamHScore) {
        this.teamHScore = teamHScore;
    }

    public Fixture withTeamHScore(Object teamHScore) {
        this.teamHScore = teamHScore;
        return this;
    }

    @JsonProperty("stats")
    public List<Stat> getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public Fixture withStats(List<Stat> stats) {
        this.stats = stats;
        return this;
    }

    @JsonProperty("team_h_difficulty")
    public Integer getTeamHDifficulty() {
        return teamHDifficulty;
    }

    @JsonProperty("team_h_difficulty")
    public void setTeamHDifficulty(Integer teamHDifficulty) {
        this.teamHDifficulty = teamHDifficulty;
    }

    public Fixture withTeamHDifficulty(Integer teamHDifficulty) {
        this.teamHDifficulty = teamHDifficulty;
        return this;
    }

    @JsonProperty("team_a_difficulty")
    public Integer getTeamADifficulty() {
        return teamADifficulty;
    }

    @JsonProperty("team_a_difficulty")
    public void setTeamADifficulty(Integer teamADifficulty) {
        this.teamADifficulty = teamADifficulty;
    }

    public Fixture withTeamADifficulty(Integer teamADifficulty) {
        this.teamADifficulty = teamADifficulty;
        return this;
    }

    @JsonProperty("pulse_id")
    public Integer getPulseId() {
        return pulseId;
    }

    @JsonProperty("pulse_id")
    public void setPulseId(Integer pulseId) {
        this.pulseId = pulseId;
    }

    public Fixture withPulseId(Integer pulseId) {
        this.pulseId = pulseId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Fixture withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fixture.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("finished");
        sb.append('=');
        sb.append(((this.finished == null)?"<null>":this.finished));
        sb.append(',');
        sb.append("finishedProvisional");
        sb.append('=');
        sb.append(((this.finishedProvisional == null)?"<null>":this.finishedProvisional));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("kickoffTime");
        sb.append('=');
        sb.append(((this.kickoffTime == null)?"<null>":this.kickoffTime));
        sb.append(',');
        sb.append("minutes");
        sb.append('=');
        sb.append(((this.minutes == null)?"<null>":this.minutes));
        sb.append(',');
        sb.append("provisionalStartTime");
        sb.append('=');
        sb.append(((this.provisionalStartTime == null)?"<null>":this.provisionalStartTime));
        sb.append(',');
        sb.append("started");
        sb.append('=');
        sb.append(((this.started == null)?"<null>":this.started));
        sb.append(',');
        sb.append("teamA");
        sb.append('=');
        sb.append(((this.teamA == null)?"<null>":this.teamA));
        sb.append(',');
        sb.append("teamAScore");
        sb.append('=');
        sb.append(((this.teamAScore == null)?"<null>":this.teamAScore));
        sb.append(',');
        sb.append("teamH");
        sb.append('=');
        sb.append(((this.teamH == null)?"<null>":this.teamH));
        sb.append(',');
        sb.append("teamHScore");
        sb.append('=');
        sb.append(((this.teamHScore == null)?"<null>":this.teamHScore));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
        sb.append(',');
        sb.append("teamHDifficulty");
        sb.append('=');
        sb.append(((this.teamHDifficulty == null)?"<null>":this.teamHDifficulty));
        sb.append(',');
        sb.append("teamADifficulty");
        sb.append('=');
        sb.append(((this.teamADifficulty == null)?"<null>":this.teamADifficulty));
        sb.append(',');
        sb.append("pulseId");
        sb.append('=');
        sb.append(((this.pulseId == null)?"<null>":this.pulseId));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.teamHDifficulty == null)? 0 :this.teamHDifficulty.hashCode()));
        result = ((result* 31)+((this.teamAScore == null)? 0 :this.teamAScore.hashCode()));
        result = ((result* 31)+((this.minutes == null)? 0 :this.minutes.hashCode()));
        result = ((result* 31)+((this.kickoffTime == null)? 0 :this.kickoffTime.hashCode()));
        result = ((result* 31)+((this.provisionalStartTime == null)? 0 :this.provisionalStartTime.hashCode()));
        result = ((result* 31)+((this.finished == null)? 0 :this.finished.hashCode()));
        result = ((result* 31)+((this.started == null)? 0 :this.started.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        result = ((result* 31)+((this.teamA == null)? 0 :this.teamA.hashCode()));
        result = ((result* 31)+((this.teamH == null)? 0 :this.teamH.hashCode()));
        result = ((result* 31)+((this.teamHScore == null)? 0 :this.teamHScore.hashCode()));
        result = ((result* 31)+((this.finishedProvisional == null)? 0 :this.finishedProvisional.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.teamADifficulty == null)? 0 :this.teamADifficulty.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.pulseId == null)? 0 :this.pulseId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fixture) == false) {
            return false;
        }
        Fixture rhs = ((Fixture) other);
        return (((((((((((((((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.teamHDifficulty == rhs.teamHDifficulty)||((this.teamHDifficulty!= null)&&this.teamHDifficulty.equals(rhs.teamHDifficulty))))&&((this.teamAScore == rhs.teamAScore)||((this.teamAScore!= null)&&this.teamAScore.equals(rhs.teamAScore))))&&((this.minutes == rhs.minutes)||((this.minutes!= null)&&this.minutes.equals(rhs.minutes))))&&((this.kickoffTime == rhs.kickoffTime)||((this.kickoffTime!= null)&&this.kickoffTime.equals(rhs.kickoffTime))))&&((this.provisionalStartTime == rhs.provisionalStartTime)||((this.provisionalStartTime!= null)&&this.provisionalStartTime.equals(rhs.provisionalStartTime))))&&((this.finished == rhs.finished)||((this.finished!= null)&&this.finished.equals(rhs.finished))))&&((this.started == rhs.started)||((this.started!= null)&&this.started.equals(rhs.started))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))))&&((this.teamA == rhs.teamA)||((this.teamA!= null)&&this.teamA.equals(rhs.teamA))))&&((this.teamH == rhs.teamH)||((this.teamH!= null)&&this.teamH.equals(rhs.teamH))))&&((this.teamHScore == rhs.teamHScore)||((this.teamHScore!= null)&&this.teamHScore.equals(rhs.teamHScore))))&&((this.finishedProvisional == rhs.finishedProvisional)||((this.finishedProvisional!= null)&&this.finishedProvisional.equals(rhs.finishedProvisional))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.teamADifficulty == rhs.teamADifficulty)||((this.teamADifficulty!= null)&&this.teamADifficulty.equals(rhs.teamADifficulty))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event))))&&((this.pulseId == rhs.pulseId)||((this.pulseId!= null)&&this.pulseId.equals(rhs.pulseId))));
    }

}
