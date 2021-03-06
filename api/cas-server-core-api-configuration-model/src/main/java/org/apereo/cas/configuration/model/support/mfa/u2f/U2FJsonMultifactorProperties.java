package org.apereo.cas.configuration.model.support.mfa.u2f;

import org.apereo.cas.configuration.model.SpringResourceProperties;
import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * This is {@link U2FJsonMultifactorProperties}.
 *
 * @author Misagh Moayyed
 * @since 6.3.0
 */

@RequiresModule(name = "cas-server-support-u2f")
@Getter
@Setter
@Accessors(chain = true)
public class U2FJsonMultifactorProperties extends SpringResourceProperties {
    private static final long serialVersionUID = -6883660787308509919L;
}
