package org.katis.zap.runtime

trait Arena {

  def tryGetSegment(id: Int): SegmentReader

  def checkReadLimit(numBytes: Int): Unit
}
