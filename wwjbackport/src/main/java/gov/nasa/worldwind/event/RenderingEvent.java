/*
Copyright (C) 2001, 2006 United States Government
as represented by the Administrator of the
National Aeronautics and Space Administration.
All Rights Reserved.
*/
package gov.nasa.worldwind.event;

import gov.nasa.worldwind.util.Logging;

import java.util.EventObject;

/**
 * @author tag
 * @version $Id: RenderingEvent.java 2471 2007-07-31 21:50:57Z tgaskins $
 */
public class RenderingEvent extends EventObject
{
    public static final String BEFORE_RENDERING = "gov.nasa.worldwind.RenderingEvent.BeforeRendering";
    public static final String BEFORE_BUFFER_SWAP = "gov.nasa.worldwind.RenderingEvent.BeforeBufferSwap";
    public static final String AFTER_BUFFER_SWAP = "gov.nasa.worldwind.RenderingEvent.AfterBufferSwap";

    private String stage;

    public RenderingEvent(Object source, String stage)
    {
        super(source);
        this.stage = stage;
    }

    public String getStage()
    {
        return this.stage != null ? this.stage : "gov.nasa.worldwind.RenderingEvent.UnknownStage";
    }

    @Override
    public String toString()
    {
        return this.getClass().getName() + " "
            + this.stage != null ? this.stage : Logging.getMessage("generic.Unknown");
    }
}
