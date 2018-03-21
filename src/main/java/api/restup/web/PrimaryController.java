package api.restup.web;

import api.restup.marketFeasibility.service.MarketFeasibilityImpl;
import api.restup.marketFeasibility.service.MarketFeasibilityResult;
import api.restup.marketFeasibility.service.MarketFeasibilityService;
import java.security.NoSuchAlgorithmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PrimaryController {

    @Autowired
    MarketFeasibilityService marketFeasibilityService;

    /**
     *
     * @param marketFeasibilityImpl pojo for req obj
     * @return {json} success / fail message
     * @throws NoSuchAlgorithmException
     */
    @RequestMapping(value = "/marketFeasibility", method = RequestMethod.POST)
    public MarketFeasibilityResult addBlock(@RequestBody MarketFeasibilityImpl marketFeasibilityImpl)
            throws NoSuchAlgorithmException {

        String blockData = marketFeasibilityImpl.getBlockData();

        MarketFeasibilityService marketFeasibilityService = new MarketFeasibilityService(blockData);

        String blockHash = marketFeasibilityService.getBlockHash();

        // create new block
        if ( marketFeasibilityService.createBlock() ) {
            return new MarketFeasibilityResult(blockHash, "SUCCESS - A new block has been added to the chain.");
        } else {
            return new MarketFeasibilityResult("Failure to create block.", "ERROR - Conflict exists in block chain.");
        }
    }

}
