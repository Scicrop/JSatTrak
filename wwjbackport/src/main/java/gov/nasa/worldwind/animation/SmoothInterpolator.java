/* Copyright (C) 2001, 2009 United States Government as represented by
the Administrator of the National Aeronautics and Space Administration.
All Rights Reserved.
*/
package gov.nasa.worldwind.animation;

/**
 * @author jym
 * @version $Id: SmoothInterpolator.java 12631 2009-09-22 02:23:09Z jterhorst $
 */
public class SmoothInterpolator extends ScheduledInterpolator
{
    private boolean useMidZoom = true;
    private final int MAX_SMOOTHING = 3;
    private final double START = this.useMidZoom ? 0.0 : 0.6;
    private final double STOP = 1.0;

    public SmoothInterpolator(long lengthMillis)
    {
        super(lengthMillis);
    }

    public double nextInterpolant()
    {
        double interpolant = super.nextInterpolant();
        return basicInterpolant(interpolant,
            this.START, this.STOP, this.MAX_SMOOTHING);
    }

    protected static double basicInterpolant(double interpolant, double startInterpolant,
        double stopInterpolant,
        int maxSmoothing)
    {
        double normalizedInterpolant = AnimationSupport.interpolantNormalized(interpolant, startInterpolant,
            stopInterpolant);
        return AnimationSupport.interpolantSmoothed(normalizedInterpolant, maxSmoothing);
    }

     // ============== Helper Functions ======================= //
    // ============== Helper Functions ======================= //
    // ============== Helper Functions ======================= //

    // Map amount range [startAmount, stopAmount] to [0, 1] when amount is inside range.
    
}
