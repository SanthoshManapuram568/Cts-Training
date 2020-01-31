import { PipeCheckPipe } from './pipe-check.pipe';

describe('PipeCheckPipe', () => {
  it('create an instance', () => {
    const pipe = new PipeCheckPipe();
    expect(pipe).toBeTruthy();
  });
});
