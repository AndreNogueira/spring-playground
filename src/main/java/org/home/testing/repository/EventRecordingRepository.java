package org.home.testing.repository;

import java.util.UUID;
import org.home.testing.domain.EventRecording;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRecordingRepository extends BaseRepository<EventRecording, UUID> {


}
