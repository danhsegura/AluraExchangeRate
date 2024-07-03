import java.util.Map;

public record httpRequest(String result , String documentation, String terms, String lastTimeUpdateUnix, String lastTimeUpdateUCT, String nextTimeUpdateUnix, String nextTimeUpdateUCT, String baseCode, Map<String, Float> conversion_rates) {
}
