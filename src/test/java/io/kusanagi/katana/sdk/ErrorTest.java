/*
 * Java 7 SDK for the KATANA(tm) Platform (http://katana.kusanagi.io)
 * Copyright (c) 2016-2017 KUSANAGI S.L. All rights reserved.
 *
 * Distributed under the MIT license
 *
 * For the full copyright and license information, please view the LICENSE
 *  file that was distributed with this source code
 *
 * @link      https://github.com/kusanagi/katana-sdk-java7
 * @license   http://www.opensource.org/licenses/mit-license.php MIT License
 * @copyright Copyright (c) 2016-2017 KUSANAGI S.L. (http://kusanagi.io)
 *
 */

package io.kusanagi.katana.sdk;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by juane on 2/11/17.
 */
public class ErrorTest {

    private Error error;

    @Before
    public void setup() {
        this.error = new Error();
    }

    @Test
    public void defaultValues() {
        Assert.assertEquals("Unknown error", error.getMessage());
        Assert.assertEquals(0, error.getCode());
        Assert.assertEquals("500 Internal Server Error", error.getStatus());
    }

    @Test
    public void equalsAndHashcode() {
        Error error = new Error();
        Assert.assertEquals(error, new Error(error));
        Assert.assertEquals(-1348468619, error.hashCode());
        Assert.assertEquals(
                "Error{message='Unknown error', code='0', status='500 Internal Server Error'}",
                error.toString());
    }

}