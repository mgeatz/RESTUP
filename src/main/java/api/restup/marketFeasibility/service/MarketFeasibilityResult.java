package api.restup.marketFeasibility.service;

/**
 *
 * Description: representation class which Jackson uses to
 * marshal instances of type EmailResult into JSON
 *
 * The returned JSON is formatted as such:
 *
 * {"result":"success","id":1}
 *
 */
public class MarketFeasibilityResult {

    private String result;
    private String blockHash;

    public MarketFeasibilityResult(String blockHash, String result) {
        this.result = result;
        this.blockHash = blockHash;
    }

    public String getResult() {
        return result;
    }

    public String getBlockHash() {
        return blockHash;
    }
}
