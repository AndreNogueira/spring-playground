package org.home.testing.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.home.testing.domain.EventRecording;
import org.home.testing.service.EventRecordingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EventRecordingResource {

  private final EventRecordingService eventRecordingService;

  @GetMapping("/test")
  @ResponseStatus(HttpStatus.OK)
  public void registerAccount() {
    List<EventRecording> eventRecordings = IntStream.range(0, 500).mapToObj(i -> EventRecording.builder().build()).collect(Collectors.toList());
    eventRecordingService.saveAll(eventRecordings);


  }


}
