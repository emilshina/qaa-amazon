package io.github.sskorol.testcases;

import io.github.sskorol.pages.SearchAmazonPage;
import io.github.sskorol.pages.SearchPage;
import org.testng.annotations.Test;

import static io.github.sskorol.core.PageFactory.at;
import static io.github.sskorol.core.PageFactory.open;
import static org.assertj.core.api.Assertions.assertThat;

public class AmazonTests {
    @Test
    public void shouldSearchForKeyword() {
        open(SearchAmazonPage.class)
                .searchFor("running shoes nike")
                .filterByType("Men\'s Running Shoes")
                .filterByColor("Red")
                .filterByBrand("NIKE")
                .filterBySize("9");




        //assertThat(at(SearchPage.class).getLinksAmount()).isGreaterThan(8);
    }

}
