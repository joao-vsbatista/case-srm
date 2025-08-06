package com.srm.currency.mapper;

import com.srm.currency.entity.Kingdom;
import com.srm.currency.model.generated.KingdomSimpleOpenApiDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-06T15:54:55-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.16 (Microsoft)"
)
@Component
public class KingdomMapperImpl implements KingdomMapper {

    @Override
    public KingdomSimpleOpenApiDto toKingdomSimple(Kingdom kingdom) {
        if ( kingdom == null ) {
            return null;
        }

        KingdomSimpleOpenApiDto.KingdomSimpleOpenApiDtoBuilder<?, ?> kingdomSimpleOpenApiDto = KingdomSimpleOpenApiDto.builder();

        if ( kingdom.getId() != null ) {
            kingdomSimpleOpenApiDto.id( kingdom.getId().intValue() );
        }
        kingdomSimpleOpenApiDto.name( kingdom.getName() );
        kingdomSimpleOpenApiDto.description( kingdom.getDescription() );

        return kingdomSimpleOpenApiDto.build();
    }

    @Override
    public List<KingdomSimpleOpenApiDto> toListKingdomSimple(List<Kingdom> kingdoms) {
        if ( kingdoms == null ) {
            return null;
        }

        List<KingdomSimpleOpenApiDto> list = new ArrayList<KingdomSimpleOpenApiDto>( kingdoms.size() );
        for ( Kingdom kingdom : kingdoms ) {
            list.add( toKingdomSimple( kingdom ) );
        }

        return list;
    }
}
