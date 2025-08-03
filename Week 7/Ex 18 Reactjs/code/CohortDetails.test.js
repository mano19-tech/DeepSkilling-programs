import React from 'react';
import { shallow, mount } from 'enzyme';
import CohortDetails from './CohortDetails';
import { CohortData } from './Cohort'; 

test('should create the component', () => {
  const wrapper = shallow(<CohortDetails />);
  expect(wrapper.exists()).toBe(true);
});

test('should initialize the props', () => {
  const testCohort = CohortData[0]; // Use the first cohort from the data
  const wrapper = mount(<CohortDetails cohort={testCohort} />);
  expect(wrapper.props().cohort).toEqual(testCohort);
});


test('should display cohort code in h3', () => {
  const testCohort = CohortData[0];
  const wrapper = mount(<CohortDetails cohort={testCohort} />);
  const h3 = wrapper.find('h3');
  expect(h3.text()).toContain(testCohort.code);
});

test('should always render same html', () => {
  const testCohort = CohortData[0];
  const wrapper = mount(<CohortDetails cohort={testCohort} />);
  expect(wrapper.html()).toMatchSnapshot();
});