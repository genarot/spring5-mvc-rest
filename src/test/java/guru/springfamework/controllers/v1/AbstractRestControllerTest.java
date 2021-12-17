/* Copyright (C) PublicRelay, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * The work belongs to the author's employer under work made for hire principles.
 */
package guru.springfamework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;

/**
 * @author gtinoco
 * @since 12/17/21
 */
public abstract class AbstractRestControllerTest extends TestCase {
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
