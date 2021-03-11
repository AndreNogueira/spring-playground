package org.home.testing.service.impl;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.home.testing.domain.EventRecording;
import org.home.testing.repository.EventRecordingRepository;
import org.home.testing.service.EventRecordingService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EventRecordingServiceImpl extends BaseServiceImpl<EventRecording, UUID> implements EventRecordingService {

  private EventRecordingRepository eventRecordingRepository;

  public EventRecordingServiceImpl(EventRecordingRepository eventRecordingRepository) {
    super(eventRecordingRepository);
  }


}
