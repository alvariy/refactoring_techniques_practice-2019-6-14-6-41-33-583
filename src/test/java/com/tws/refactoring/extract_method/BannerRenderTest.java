package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BannerRenderTest {
    @Test
    public void return_IE_on_Mac_when_browser_equals_IE_platform_MAC() {


        String expectedValue = "IE on Mac?";

        BannerRender bannerRender = new BannerRender();
        
        String actualValue = bannerRender.renderBanner("MAC", "IE");

        assertThat(expectedValue, is(actualValue));
    }


}
