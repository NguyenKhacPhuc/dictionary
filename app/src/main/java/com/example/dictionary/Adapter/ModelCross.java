package com.example.dictionary.Adapter;

public class ModelCross {
    String step;
    int image;
    String description;

    public ModelCross(String step, int image, String description) {
        this.step = step;
        this.image = image;
        this.description = description;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
