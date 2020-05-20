import jp.crestmuse.cmx.filewrappers.*

for (int i in 1..112) {
  def scc = new SCCDataSet(480)
  def part = scc.addPart(1, 1, 0, 0)
  part.addProgramChange(0, i-1)
  part.addNoteElement(10, 970, 60, 127, 127)
  scc.toWrapper().toMIDIXML().writefileAsSMF(String.format("%03d", i) + ".mid")
}
