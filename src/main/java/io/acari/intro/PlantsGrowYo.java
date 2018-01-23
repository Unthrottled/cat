package io.acari.intro;

public class PlantsGrowYo {

    /**
     * Each day a plant is growing by upSpeed meters.
     * <p>
     * Each night that plant's height decreases by downSpeed
     * meters due to the lack of sun heat.
     * <p>
     * Initially, plant is 0 meters tall.
     * <p>
     * We plant the seed at the beginning of a day.
     * <p>
     * We want to know when the height of the plant will
     * reach a certain level.
     *
     * @param upSpeed
     * @param downSpeed
     * @param desiredHeight
     * @return
     */
    int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 0;
        int height = 0;
        do {
            height += upSpeed;
            ++days;
        } while (height < desiredHeight && (height -= downSpeed) > 0);
        return days;
    }
}
