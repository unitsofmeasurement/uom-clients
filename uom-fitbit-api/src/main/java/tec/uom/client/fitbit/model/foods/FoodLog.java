package tec.uom.client.fitbit.model.foods;

import hirondelle.date4j.DateTime;

/**
 * User: Anakar Parida
 * Date: May 5, 2015
 * Time: 1:55:43 AM
 */
public class FoodLog {
    protected final long logId;
    protected final LoggedFood loggedFood;
    protected final NutritionalValues nutritionalValues;
    protected final boolean isFavorite;
    private DateTime logDate;

    public FoodLog(long logId, LoggedFood loggedFood, NutritionalValues nutritionalValues, boolean favorite) {
        this.logId = logId;
        this.loggedFood = loggedFood;
        this.nutritionalValues = nutritionalValues;
        isFavorite = favorite;
    }

    public FoodLog(long logId, LoggedFood loggedFood, NutritionalValues nutritionalValues, boolean favorite, DateTime logDate) {
        this(logId, loggedFood, nutritionalValues, favorite);
        this.logDate = logDate;
    }

    public final long getLogId() {
        return logId;
    }

    public final LoggedFood getLoggedFood() {
        return loggedFood;
    }

    public final NutritionalValues getNutritionalValues() {
        return nutritionalValues;
    }

    public final boolean isFavorite() {
        return isFavorite;
    }

    /**
     * Returns the log date if it is set. Throws an exception if it is not set.
     * <p>
     * Typically, the API will not return the log date when the request narrows the log date to a single value.
     * This is the case, e.g., when the list of logged resources on a given date is requested. 
     * </p>
     * @return the log date if it is set.
     * @throws UnsupportedOperationException if parsing is not supported
     */
    public DateTime getLogDate() {
        if (null == logDate) {
            throw new UnsupportedOperationException("Log date is not available. This is an error only if log date was expected.");
        }
        return logDate;
    }

}