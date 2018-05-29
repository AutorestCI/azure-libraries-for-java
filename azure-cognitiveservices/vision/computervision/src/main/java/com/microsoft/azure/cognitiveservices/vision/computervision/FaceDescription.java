/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing a face identified in the image.
 */
public class FaceDescription {
    /**
     * Possible age of the face.
     */
    @JsonProperty(value = "age")
    private Integer age;

    /**
     * Possible gender of the face. Possible values include: 'Male', 'Female'.
     */
    @JsonProperty(value = "gender")
    private Gender gender;

    /**
     * The faceRectangle property.
     */
    @JsonProperty(value = "faceRectangle")
    private FaceRectangle faceRectangle;

    /**
     * Get possible age of the face.
     *
     * @return the age value
     */
    public Integer age() {
        return this.age;
    }

    /**
     * Set possible age of the face.
     *
     * @param age the age value to set
     * @return the FaceDescription object itself.
     */
    public FaceDescription withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * Get possible gender of the face. Possible values include: 'Male', 'Female'.
     *
     * @return the gender value
     */
    public Gender gender() {
        return this.gender;
    }

    /**
     * Set possible gender of the face. Possible values include: 'Male', 'Female'.
     *
     * @param gender the gender value to set
     * @return the FaceDescription object itself.
     */
    public FaceDescription withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Get the faceRectangle value.
     *
     * @return the faceRectangle value
     */
    public FaceRectangle faceRectangle() {
        return this.faceRectangle;
    }

    /**
     * Set the faceRectangle value.
     *
     * @param faceRectangle the faceRectangle value to set
     * @return the FaceDescription object itself.
     */
    public FaceDescription withFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
        return this;
    }

}
