/* Copyright (C) PublicRelay, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * The work belongs to the author's employer under work made for hire principles.
 */
package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author gtinoco
 * @since 12/17/21
 */
@Data
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    @JsonProperty("customer_url")
    private String customerUrl;
}
