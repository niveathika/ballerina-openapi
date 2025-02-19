/*
 * Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.ballerina.openapi.converter.service;

import java.util.Optional;

/**
 * This @link ConstraintAnnotation} class represents the constraint annotations.
 *
 * @since 1.9.0
 */
public class ConstraintAnnotation {
    private final String minValue;
    private final String maxValue;
    private final String length;
    private final String minLength;
    private final String maxLength;
    private final String minValueExclusive;
    private final String maxValueExclusive;
    private final String pattern;

    public ConstraintAnnotation(ConstraintAnnotationBuilder builder) {
        this.minValue = builder.minValue;
        this.maxValue = builder.maxValue;
        this.length = builder.length;
        this.minLength = builder.minLength;
        this.maxLength = builder.maxLength;
        this.minValueExclusive = builder.minValueExclusive;
        this.maxValueExclusive = builder.maxValueExclusive;
        this.pattern = builder.pattern;
    }

    public Optional<String> getMinValue() {
        return Optional.ofNullable(minValue);
    }

    public Optional<String> getMaxValue() {
        return Optional.ofNullable(maxValue);
    }

    public Optional<String> getLength() {
        return Optional.ofNullable(length);
    }

    public Optional<String> getMinLength() {
        return Optional.ofNullable(minLength);
    }

    public Optional<String> getMaxLength() {
        return Optional.ofNullable(maxLength);
    }

    public Optional<String> getMinValueExclusive() {
        return Optional.ofNullable(minValueExclusive);
    }

    public Optional<String> getMaxValueExclusive() {
        return Optional.ofNullable(maxValueExclusive);
    }

    public Optional<String> getPattern() {
        return Optional.ofNullable(pattern);
    }

    /**
     * This is the builder class for the {@link ConstraintAnnotation}.
     */
    public static class ConstraintAnnotationBuilder {
        private String minValue;
        private String maxValue;
        private String length;
        private String minLength;
        private String maxLength;
        private String minValueExclusive;
        private String maxValueExclusive;
        private String pattern;

        public ConstraintAnnotationBuilder withMinValue(String minValue) {
            this.minValue = minValue;
            return this;
        }

        public ConstraintAnnotationBuilder withLength(String length) {
            this.length = length;
            return this;
        }

        public ConstraintAnnotationBuilder withMaxValue(String maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        public ConstraintAnnotationBuilder withMinLength(String minLength) {
            this.minLength = minLength;
            return this;
        }

        public ConstraintAnnotationBuilder withMaxLength(String maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public ConstraintAnnotationBuilder withMinValueExclusive(String minValueExclusive) {
            this.minValueExclusive = minValueExclusive;
            return this;
        }

        public ConstraintAnnotationBuilder withMaxValueExclusive(String maxValueExclusive) {
            this.maxValueExclusive = maxValueExclusive;
            return this;
        }

        public ConstraintAnnotationBuilder withPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        public ConstraintAnnotation build() {
            ConstraintAnnotation constraintAnnotation = new ConstraintAnnotation(this);
            return constraintAnnotation;
        }
    }
}
