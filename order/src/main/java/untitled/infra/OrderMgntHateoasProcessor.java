package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class OrderMgntHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<OrderMgnt>> {

    @Override
    public EntityModel<OrderMgnt> process(EntityModel<OrderMgnt> model) {
        return model;
    }
}
