package com.srm.currency.service;

import com.srm.currency.api.generated.KingdomsApi;
import com.srm.currency.entity.Kingdom;
import com.srm.currency.mapper.KingdomMapper;
import com.srm.currency.mapper.ProductMapper;
import com.srm.currency.model.generated.KingdomSimpleOpenApiDto;
import com.srm.currency.repository.KingdomRepository;
import com.srm.currency.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class KingdomsService implements KingdomsApi {
    private final KingdomRepository kingdomRepository;
    private final KingdomMapper kingdomMapper;

    @Override
    public ResponseEntity<List<KingdomSimpleOpenApiDto>> getAllKingdoms() {
        List<Kingdom> listaDeKingdom = kingdomRepository.findAll();
        List<KingdomSimpleOpenApiDto> listaFinal = kingdomMapper.toListKingdomSimple(listaDeKingdom);
        return ResponseEntity.ok(listaFinal);
    }
}
