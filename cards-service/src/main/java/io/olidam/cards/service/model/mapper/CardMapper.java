package io.olidam.cards.service.model.mapper;

import io.olidam.cards.service.model.dto.CardDto;
import io.olidam.cards.service.model.entity.CardEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CardMapper {

    CardDto toApi(CardEntity entity);

    CardEntity toDb(CardDto dto);

    default List<CardDto> toApi(List<CardEntity> source) {
        return source.stream()
                .map(this::toApi)
                .toList();
    }

    default List<CardEntity> toDb(List<CardDto> source) {
        return source.stream()
                .map(this::toDb)
                .toList();
    }
}
