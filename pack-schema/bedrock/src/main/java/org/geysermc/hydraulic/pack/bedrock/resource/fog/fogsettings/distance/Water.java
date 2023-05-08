package org.geysermc.hydraulic.pack.bedrock.resource.fog.fogsettings.distance;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import org.geysermc.hydraulic.pack.bedrock.resource.fog.fogsettings.distance.water.TransitionFog;

public class Water {
  @JsonProperty("fog_start")
  public float fogStart;

  @JsonProperty("fog_end")
  public float fogEnd;

  @JsonProperty("fog_color")
  public String fogColor;

  @JsonProperty("render_distance_type")
  public String renderDistanceType;

  @JsonProperty("transition_fog")
  public TransitionFog transitionFog;

  /**
   * The distance from the player that the fog will begin to appear. 'fog_start' must be less than or equal to 'fog_end'.
   *
   * @return Fog Start
   */
  public float getFogStart() {
    return this.fogStart;
  }

  /**
   * The distance from the player that the fog will begin to appear. 'fog_start' must be less than or equal to 'fog_end'.
   *
   * @param fogStart Fog Start
   */
  public void setFogStart(float fogStart) {
    this.fogStart = fogStart;
  }

  /**
   * The distance from the player that the fog will become fully opaque. 'fog_end' must be greater than or equal to 'fog_start'.
   *
   * @return Fog End
   */
  public float getFogEnd() {
    return this.fogEnd;
  }

  /**
   * The distance from the player that the fog will become fully opaque. 'fog_end' must be greater than or equal to 'fog_start'.
   *
   * @param fogEnd Fog End
   */
  public void setFogEnd(float fogEnd) {
    this.fogEnd = fogEnd;
  }

  /**
   * The color that the fog will take on.
   *
   * @return Fog Color
   */
  public String getFogColor() {
    return this.fogColor;
  }

  /**
   * The color that the fog will take on.
   *
   * @param fogColor Fog Color
   */
  public void setFogColor(String fogColor) {
    this.fogColor = fogColor;
  }

  /**
   * Determines how distance value is used. Fixed distance is measured in blocks. Dynamic distance is multiplied by the current render distance.
   *
   * @return Render Distance Type
   */
  public String getRenderDistanceType() {
    return this.renderDistanceType;
  }

  /**
   * Determines how distance value is used. Fixed distance is measured in blocks. Dynamic distance is multiplied by the current render distance.
   *
   * @param renderDistanceType Render Distance Type
   */
  public void setRenderDistanceType(String renderDistanceType) {
    this.renderDistanceType = renderDistanceType;
  }

  /**
   * Additional fog data which will slowly transition to the distance fog of current biome.
   *
   * @return Transition Fog
   */
  public TransitionFog getTransitionFog() {
    return this.transitionFog;
  }

  /**
   * Additional fog data which will slowly transition to the distance fog of current biome.
   *
   * @param transitionFog Transition Fog
   */
  public void setTransitionFog(TransitionFog transitionFog) {
    this.transitionFog = transitionFog;
  }
}