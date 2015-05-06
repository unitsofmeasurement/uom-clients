package tec.uom.client.fitbit.model.user;

import javax.measure.Quantity;
import javax.measure.quantity.Energy;
import javax.measure.quantity.Length;

import tec.uom.lib.domain.health.Step;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class FriendStats {
    private UserInfo user;
    private StatisticInfo summary;
    private StatisticInfo average;

    public FriendStats(UserInfo user, StatisticInfo summary, StatisticInfo average) {
        this.user = user;
        this.summary = summary;
        this.average = average;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public StatisticInfo getSummary() {
        return summary;
    }

    public void setSummary(StatisticInfo summary) {
        this.summary = summary;
    }

    public StatisticInfo getAverage() {
        return average;
    }

    public void setAverage(StatisticInfo average) {
        this.average = average;
    }

    public static class StatisticInfo {
        private Quantity<Step> steps;
        private Quantity<Energy> calories;
        private Quantity<Length> distance;

        public StatisticInfo() {

        }

        public StatisticInfo(Quantity<Step> steps, Quantity<Energy> calories, Quantity<Length> distance) {
            this.steps = steps;
            this.calories = calories;
            this.distance = distance;
        }

        public Quantity<Step> getSteps() {
            return steps;
        }

        public void setSteps(Quantity<Step> steps) {
            this.steps = steps;
        }

        public Quantity<Energy> getCalories() {
            return calories;
        }

        public void setCalories(Quantity<Energy> calories) {
            this.calories = calories;
        }

        public Quantity<Length> getDistance() {
            return distance;
        }

        public void setDistance(Quantity<Length> distance) {
            this.distance = distance;
        }

    }
}
