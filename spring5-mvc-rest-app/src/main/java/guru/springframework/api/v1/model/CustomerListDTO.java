/* Copyright (C) PublicRelay, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * The work belongs to the author's employer under work made for hire principles.
 */
package guru.springframework.api.v1.model;

import lombok.Data;

import java.util.List;

/**
 * @author gtinoco
 * @since 12/17/21
 */
@Data
public class CustomerListDTO {
    private List<CustomerDTO> customers;


    public CustomerListDTO(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}
