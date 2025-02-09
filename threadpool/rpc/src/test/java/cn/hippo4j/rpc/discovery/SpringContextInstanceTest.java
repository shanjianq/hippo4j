/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.rpc.discovery;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO Common module removes spring dependency leftovers
 */
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {InstanceModel.class})
// @RunWith(SpringJUnit4ClassRunner.class)
public class SpringContextInstanceTest {

    Instance instance = new SpringContextInstance();

    // @Test
    public void getInstance() {
        Object obj = instance.getInstance(InstanceModel.class);
        Assert.assertNotNull(obj);
        Assert.assertEquals(obj.getClass(), InstanceModel.class);
    }

    // @Test
    public void testGetInstance() {
        Object obj = instance.getInstance("instanceModel");
        Assert.assertNotNull(obj);
        Assert.assertEquals(obj.getClass(), InstanceModel.class);
    }
}