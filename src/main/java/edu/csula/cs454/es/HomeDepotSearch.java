package edu.csula.cs454.es;

import com.google.common.collect.Maps;
import edu.csula.cs454.es.models.Product;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * Elastic Search in class quiz:
 *
 * Please parse the csv files and search according to parsed data.
 */
public class HomeDepotSearch {
    // use Optional to avoid null
    private final Optional<Node> node;
    private final Optional<Client> client;

    private final Map<Long, Product> data;
    private final boolean forTesting;

    // default controller for searching on actual use case
    public HomeDepotSearch() {
        this.node = Optional.of(nodeBuilder().node())
            .put("path.home", "Your elastic search path")).node());
        this.client = Optional.of(this.node.get().client());
        this.data = Maps.newHashMap();
        this.forTesting = false;
    }

    // mock data for test
    public HomeDepotSearch(boolean forTesting) {
        this.node = Optional.empty();
        this.client = Optional.empty();
        this.data = Maps.newHashMap();
        this.forTesting = false;
    }

    // just to terminate node
    public void shutdown() {
        if (this.node.isPresent()) {
            this.node.get().close();
        }
    }

    /**
     * Parse the csv file and feed data either into data or elastic search
     */
    public void parseData(File descriptionCsvFile, File attributeCsvFile) {
        if (forTesting) {
            // TODO: feed data into `data`
        } else {
            // TODO: feed data into Elastic Search using `client`
        }
    }

    /**
     * Search product by id
     */
    public Product search(long id) {
        // TODO: return product by its id
        return null;
    }

    /**
     * Full text product search
     */
    public List<Product> search(String text) {
        return null;
    }
}
