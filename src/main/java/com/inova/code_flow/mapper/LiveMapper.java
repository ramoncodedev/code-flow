package com.inova.code_flow.mapper;

import com.inova.code_flow.dto.request.LiveRequest;
import com.inova.code_flow.dto.response.LiveResponse;
import com.inova.code_flow.entity.Live;
import com.inova.code_flow.entity.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LiveMapper {

    public Live toEntity(LiveRequest request, User createdBy) {
        return Live.builder()
                .title(request.title())
                .description(request.description())
                .link(request.link())
                .scheduledAt(request.scheduledAt())
                .isGlobal(request.isGlobal())
                .createdBy(createdBy)
                .build();
    }

    public LiveResponse toResponse(Live live) {
        return LiveResponse.builder()
                .id(live.getId())
                .title(live.getTitle())
                .description(live.getDescription())
                .link(live.getLink())
                .scheduledAt(live.getScheduledAt())
                .isGlobal(live.isGlobal())
                .createdById(live.getCreatedBy() != null ? live.getCreatedBy().getId() : null)
                .createdByName(live.getCreatedBy() != null ? live.getCreatedBy().getFullName() : null)
                .build();
    }
}