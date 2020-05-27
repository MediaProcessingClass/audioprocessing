import jp.crestmuse.cmx.filewrappers.*

for (int i in 1..128) {
  for (int n in 1..6) {
    def scc = new SCCDataSet(480)
    def part = scc.addPart(1, 1, 0, 0)
    part.addProgramChange(0, i-1)
    part.addNoteElement(10, 970, (n+1)*12+9, 127, 127)
    scc.toWrapper().toMIDIXML().writefileAsSMF(String.format("%03d", i) + "_A${n}.mid")
  }
}
