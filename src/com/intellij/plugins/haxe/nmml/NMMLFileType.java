package com.intellij.plugins.haxe.nmml;

import com.intellij.ide.highlighter.XmlLikeFileType;
import com.intellij.lang.xml.XMLLanguage;
import com.intellij.plugins.haxe.HaxeBundle;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author: Fedor.Korotkov
 */
public class NMMLFileType extends XmlLikeFileType {
  public static final NMMLFileType INSTANCE = new NMMLFileType();
  public static final String DEFAULT_EXTENSION = "nmml";

  public NMMLFileType() {
    super(XMLLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return HaxeBundle.message("nme.nmml");
  }

  @NotNull
  @Override
  public String getDescription() {
    return HaxeBundle.message("nme.nmml.description");
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return DEFAULT_EXTENSION;
  }

  @Override
  public Icon getIcon() {
    return icons.HaxeIcons.Nmml_16;
  }
}
