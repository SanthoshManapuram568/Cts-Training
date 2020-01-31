import { Calculator } from "./calculator"

// test suites/group
// xdescribe("Testing function calc1 of Calculator", ()=>{
describe("Testing function calc1 of Calculator", ()=>{
    it('Testing calc1 for negative values', ()=>{    
        // test code
        let calc = new Calculator();
        let response = calc.calc1(-5);
        expect(response).toBe(0);
    })

    it('Testing calc1 for positive values', ()=>{
        let calc = new Calculator();
        let response = calc.calc1(5);
        expect(response).toBe(6);
    })

})
describe("Testing function cal2 of Calculator",()=>{
it('Testing cal2 wheather incrementing or not',()=>{
    let cal = new Calculator();
    let res = cal.calc2(4);
    expect(res).toBe(2);
})
})