package org.home.testing.config.auditoring;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;

class AuditorAwareImpl implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    return Optional.of("admin");
  }

}
