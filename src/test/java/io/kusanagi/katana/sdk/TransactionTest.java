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

import io.kusanagi.katana.api.serializers.TransactionEntity;
import io.kusanagi.katana.utils.MockFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by juane on 2/11/17.
 */
public class TransactionTest {

    @Test
    public void equalsAndHashcode() {
        MockFactory mockFactory = new MockFactory();
        TransactionEntity object = mockFactory.getTransaction();
        Assert.assertEquals(object, new TransactionEntity(object));
        Assert.assertEquals(-669451010, object.hashCode());
        Assert.assertEquals(
                "TransactionEntity{commit=[ServiceTransaction{name='users', version='1.0.0', action='create', caller='save', params=[Param{name='user_id', value=123, type='integer', exists=false}]}], rollback=[ServiceTransaction{name='users', version='1.0.0', action='create', caller='undo', params=[Param{name='user_id', value=123, type='integer', exists=false}]}], complete=[ServiceTransaction{name='users', version='1.0.0', action='create', caller='cleanup', params=[Param{name='user_id', value=123, type='integer', exists=false}]}]}",
                object.toString());
    }

}