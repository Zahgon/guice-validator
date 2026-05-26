package ru.vyarus.guice.validator.constraint;

import com.google.inject.Injector;
import com.google.inject.Inject;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorFactory;

/**
 * Creates validator instances with guice injections available.
 * Any type of injection is allowed (constructor, setter, field).
 * Pay attention that validator usually stateful, so not declare the as singletons
 * (better not declare at all and rely on guice automatic dependecy resolution).
 *
 * @author Vyacheslav Rusakov
 * @since 24.06.2014
 */
public class GuiceConstraintValidatorFactory implements ConstraintValidatorFactory {

    @Inject
    private Injector injector;

    @Override
    public <T extends ConstraintValidator<?, ?>> T getInstance(final Class<T> key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void releaseInstance(final ConstraintValidator<?, ?> instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
