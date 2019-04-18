package org.opencyc.export;

/**
 * Interface for objects that export objects of type E.
 * @param <T> The type of object that this exporter exports.
 * @author baxter
 */
public interface Exporter<T> {
  void export(T object) throws ExportException;
}
