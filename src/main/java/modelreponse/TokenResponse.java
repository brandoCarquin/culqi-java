package modelreponse;

import lombok.Data;
import model.CardHolder;

/**
 * Created by culqi on 12/21/16.
 */

@Data
public class TokenResponse {

    private int id;

    private String value;

    private String card_number;

    private CardHolder cardholder;

    private String brand_name;

    private String bank_name;

    private String bank_country;

    private String object;

}
